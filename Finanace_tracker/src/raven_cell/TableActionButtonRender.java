package raven_cell;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionButtonRender extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(jtable, o, isSelected, hasFocus, row, column);

        // Ensure ActionPanel_Income is created with correct parameters if needed
        ActionPanel_Income actionPanel = new ActionPanel_Income();
        return actionPanel;
    }
}
