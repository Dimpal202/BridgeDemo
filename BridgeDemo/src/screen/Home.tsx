import { View, Text, NativeModules, TouchableOpacity } from 'react-native'
import React from 'react'
const HelloWorld = NativeModules.HelloWorldModule;

const Home = ({ navigation }) => {
    return (
        <View style={{ flex: 1, justifyContent: "center", alignItems: "center" }}>
            <TouchableOpacity onPress={() => navigation.navigate("Detail")}>
                <Text>hello</Text>
            </TouchableOpacity>

            <TouchableOpacity onPress={() => { HelloWorld.ShowMessage("hiii hello", 2000) }}>
                <Text>click me</Text>
            </TouchableOpacity>
        </View>
    )
}

export default Home