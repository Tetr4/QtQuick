import QtQuick 2.3
import QtQuick.Controls 1.2
import QtQuick.Layouts 1.1

ApplicationWindow {
    id: mainWindow
    visible: true
    width: 400
    height: 300
    title: qsTr("MainWindow")

    ColumnLayout {
        id: verticalLayout
        anchors.fill: parent
        anchors.margins: 11

        TextArea {
            id: textEdit
            Layout.fillHeight: true
            Layout.fillWidth: true
        }

        RowLayout {
            id: horizontalLayout

            Button {
                id: okButton
                text: qsTr("OK")
                Layout.fillWidth: true
            }

            Button {
                id: cancelButton
                text: qsTr("Cancel")
                Layout.fillWidth: true
            }
        }
    }

}
