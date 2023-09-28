import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { Button, StyleSheet, Text, View, NativeModules } from 'react-native';


export default function App() {
  const [result, setResult] = React.useState(0);
  const addTwoNumbers = async () => {
    const nativeModule = NativeModules.MyNativeModule;
    const result = await nativeModule.addTwoNumbers(1, 2);
    setResult(result);
  };
  return (
    <View style={styles.container}>
      <Text>Open up App.js to start working on your app!</Text>
      <Button onPress={addTwoNumbers} title = "Click" />
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
