// Here is the groovy file for screen elements
info("Hello From 'Slight' Gui Modifications cts script")

mainMenu {
    enabled = true // Set to true to enable this module

    splashText {
        enabled = true // Set to true to enable this module
        splashesEnabled = false // Set to false to disable splashes entirely

        customSplashes {
            enabled = true // Set to true to enable this module
            // You can put either "override" or "append" here to declare how you want to provide custom splashes
            applyMode = "append"
            defineCustom(["Live. Laugh. Loaf."])
        }
    }

    background {
        clearBackgrounds() // This line removes the rotating cube
        backgroundStayLength = 60000 // This sets the length a background would stay
        backgroundFadeLength = 1000 // This sets the fade duration to another background
        renderGradientShade = false // This sets whether the slight shade should be rendered
        image { texture = file("config/slightguimodifications/3l_bg_with_logo_left.png") }
    }

    // Uncomment these to remove aspects of the title screen
    removeMinecraftLogo()
    removeEditionBadge()

    // Clear all buttons already on screen
    clearAllButtons()

    label {
        position {
            x = 2
            y { it - 20 }

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("3L - 1.17.0-v1.0.0")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Color of the text, default is 0xFFFFFF
        color = 0xC00000
        // Whether the label has a shadow, default is false
        shadow = true
        // Mouse Hovered Color of the text, default is 0xFFFFFF
        hoveredColor = 0xF00000
        // Mouse Click Function, default is nothing, here's a list of options
        onClicked = url("https://www.curseforge.com/minecraft/modpacks/lll")
        /*
        onClicked = nothing()
        onClicked = modMenu()
        onClicked = language()
        onClicked = options()
        onClicked = exit()
        onClicked = accessibility()
        onClicked = singleplayer()
        onClicked = multiplayer()
        onClicked = realms()
        onClicked = reloadCts()
        */
        }
    }

    // le buttons
    button {
        position {
            x { it / 2 }
            y { it / 2 - 60 }
        }
        width = 100
        height = 16

        texture = file("config/slightguimodifications/3l_button.png")
        hoveredTexture = file("config/slightguimodifications/3l_button_hov.png")

        text = literal("Live Alone")
        onClicked = singleplayer()
    }
    button {
        position {
            x { it / 2 }
            y { it / 2 - 40 }
        }
        width = 100
        height = 16

        texture = file("config/slightguimodifications/3l_button.png")
        hoveredTexture = file("config/slightguimodifications/3l_button_hov.png")

        text = literal("Laugh Together")
        onClicked = multiplayer()
    }
    button {
        position {
            x { it / 2 }
            y { it / 2 - 20 }
        }
        width = 100
        height = 16

        texture = file("config/slightguimodifications/3l_button.png")
        hoveredTexture = file("config/slightguimodifications/3l_button_hov.png")

        text = literal("Options")
        onClicked = options()
    }
    button {
        position {
            x { it / 2 }
            y { it / 2 }
        }
        width = 100
        height = 16

        texture = file("config/slightguimodifications/3l_button.png")
        hoveredTexture = file("config/slightguimodifications/3l_button_hov.png")

        text = modMenuText()
        onClicked = modMenu()
    }
    button {
        position {
            x { it / 2 }
            y { it / 2 + 20 }
        }
        width = 100
        height = 16

        texture = file("config/slightguimodifications/3l_button.png")
        hoveredTexture = file("config/slightguimodifications/3l_button_hov.png")

        text = literal("With Love")
        onClicked = url("https://youtu.be/MwtVkPKx3RA")
    }
    button {
        position {
            x { it / 2 }
            y { it / 2 + 40 }
        }
        width = 100
        height = 16

        texture = file("config/slightguimodifications/3l_button.png")
        hoveredTexture = file("config/slightguimodifications/3l_button_hov.png")

        text = literal("Leave")
        onClicked = exit()
    }
}
