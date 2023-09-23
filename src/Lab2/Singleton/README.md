# Singleton Pattern for Global App Settings

This repository contains a simple Java implementation of the Singleton design pattern in the context of managing global app settings like theme, font family, layout, and text color.

## Setting Class

The `Setting` class represents the global app settings and provides methods to access and modify these settings.

- `getTheme()`: Gets the current theme setting.
- `setTheme(String theme)`: Sets the theme setting.
- `getFontFamily()`: Gets the current font family setting.
- `setFontFamily(String fontFamily)`: Sets the font family setting.
- `getLayout()`: Gets the current layout setting.
- `setLayout(String layout)`: Sets the layout setting.
- `getTextColor()`: Gets the current text color setting.
- `setTextColor(String textColor)`: Sets the text color setting.

## Singleton Implementation

The Singleton pattern is used to ensure that there is only one instance of the `Setting` class throughout the application. This is achieved through a private constructor and a private static instance variable.


