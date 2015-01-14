QtQuick
=======

QtQuick meta model

To transform an instance (*.xmi) to code (*.qml) the ecore model schema location has to be added MANUALLY to the instance root element:
<qtQuick:ApplicationWindow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:qtQuick="http://www.example.org/qtQuick" xsi:schemaLocation="http://www.example.org/qtQuick qtQuick.ecore">
