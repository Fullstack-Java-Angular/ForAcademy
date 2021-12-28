package com.foracademy.dao.Promotion;

import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.DaoUtilities;
import com.foracademy.dao.permission.PermissionFactory;
import com.foracademy.models.Promotion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PromotionDao implements IPromotionDao {

    private static final String DELETE_Promotion = "DELETE FROM Promotion WHERE idPromotion = ?";
    private static final String UPDATE_Promotion = "UPDATE Promotion SET name = ?,year=? , startDate = ?, endDate = ? WHERE idPromotion = ? ";
    private static final String INSERT_Promotion = "INSERT INTO Promotion (name, year, startDate, endDate) VALUES (?, ?, ?, ?)";
    private static final String SELECT_Promotion = "SELECT * FROM Promotion";
    private static final String SELECT_ONE_Promotion = "SELECT * FROM Promotion WHERE idPromotion = ?";

    private DaoFactory daoFactory;
    public PromotionDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public int delete(int id) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] object ={ id };
        return DaoUtilities.cud(connection,DELETE_Promotion,object);
    }

    @Override
    public List<Promotion> findAll() throws SQLException{
        Connection connection = DaoFactory.getInstance().getConnection();
        List<Promotion> promotionList = new ArrayList<>();

        ResultSet rs =  DaoUtilities.select(connection,SELECT_Promotion);
        while (rs.next()){
            promotionList.add(PromotionFactory.create(rs));
        }
        return promotionList;
    }

    @Override
    public Promotion findById(int id) throws SQLException{
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] object = {id};
        ResultSet rs = DaoUtilities.select(connection,SELECT_ONE_Promotion,id);
        rs.next();
        return PromotionFactory.create(rs);
    }

    @Override
    public int insert(Promotion promotion) throws SQLException{
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] obj = {promotion.getName(),promotion.getYear(), promotion.getStartDate(),promotion.getEndDate()};
        return DaoUtilities.cud(connection,INSERT_Promotion,obj) ;
    }

    @Override
    public int update(Promotion promotion) throws SQLException{
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] obj = {promotion.getId(),promotion.getName(), promotion.getStartDate(),promotion.getEndDate(),promotion.getYear()};
        return DaoUtilities.cud(connection,UPDATE_Promotion,obj) ;
    }
}
