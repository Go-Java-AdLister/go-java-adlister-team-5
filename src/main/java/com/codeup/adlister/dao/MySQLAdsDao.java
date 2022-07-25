package com.codeup.adlister.dao.dao;

import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.dao.Config;
import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Ad> all() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM ads");
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            String insertQuery = "INSERT INTO ads(user_id, title, park_name, description, elevation, hike_distance, max_occupancy) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
//            stmt.setLong(1, ad.getId());
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getPark_name());
            stmt.setString(4, ad.getDescription());
            stmt.setInt(5, ad.getElevation());
            stmt.setInt(6, ad.getHike_distance());
            stmt.setInt(7, ad.getMax_occupancy());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    @Override
    public void insert(long id, long parseLong) {

    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
//                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("park_name"),
                rs.getString("description"),
                rs.getInt("elevation"),
                rs.getInt("hike_distance"),
                rs.getInt("max_occupancy")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }
}
