import * as React from 'react';
import {Button, SafeAreaView} from 'react-native';
import ExampleToastModule from './ExampleToastModule';

const App: React.FC = () => {
  return (
    <SafeAreaView style={{flex: 1, justifyContent: 'center'}}>
      <Button
        title="Make a toast!"
        onPress={() => ExampleToastModule.showToast('HEY WORLD!')}
      />
    </SafeAreaView>
  );
};

export default App;
