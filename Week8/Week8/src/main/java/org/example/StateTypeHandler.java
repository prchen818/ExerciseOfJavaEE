package org.example;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StateTypeHandler extends BaseTypeHandler<State> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, State state, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, String.valueOf(state.getCode()));
    }

    @Override
    public State getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return State.getState(resultSet.getInt(s));
    }

    @Override
    public State getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return State.getState(resultSet.getInt(i));
    }

    @Override
    public State getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return State.getState(callableStatement.getInt(i));
    }
}
