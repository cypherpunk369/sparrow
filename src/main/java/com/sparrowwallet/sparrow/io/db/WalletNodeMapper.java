package com.sparrowwallet.sparrow.io.db;

import com.sparrowwallet.drongo.wallet.WalletNode;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletNodeMapper implements RowMapper<WalletNode> {
    @Override
    public WalletNode map(ResultSet rs, StatementContext ctx) throws SQLException {
        WalletNode walletNode = new WalletNode(rs.getString("walletNode.derivationPath"));
        walletNode.setId(rs.getLong("walletNode.id"));
        walletNode.setLabel(rs.getString("walletNode.label"));

        return walletNode;
    }
}
