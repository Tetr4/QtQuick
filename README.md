# QtQuick EMF Meta model + Code Generator

This repository in combination with https://github.com/Tetr4/QWidget allows transforming [QWidget](https://doc.qt.io/qt-4.8/qwidget.html) UI files to [QtQuick](https://doc.qt.io/qt-4.8/qtquick.html) QML files via [Eclipse Modeling Framework](https://en.wikipedia.org/wiki/Eclipse_Modeling_Framework) meta models.

This repository contains a basic meta model for QtQuick. Code for QtQuick QML files can be generated from model instances via [Xpand](https://wiki.eclipse.org/Xpand) (model2text).

### Generate code file (\*.qml) from QtQuick model instance (\*.xmi):
Run *codegen/generator.mwe2* as MWE2 Workflow. The QtQuick instance should be saved at *model/QtQuickInstance.xmi*. The code will be generated at *out/main.qml*.
