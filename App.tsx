import * as React from 'react';
import {Button, SafeAreaView} from 'react-native';
import ExampleToastModule from './ExampleToastModule';
import ExampleImageView from './ExampleImageView';

const App: React.FC = () => {
  return (
    <SafeAreaView style={{flex: 1, justifyContent: 'center'}}>
      <Button
        title="Make a toast!"
        onPress={() => {
          ExampleToastModule.showToast('HEY WORLD!');
        }}
      />
      <ExampleImageView
        src="https://source.unsplash.com/WLUHO9A_xik/1600x900"
        style={{width: '100%', height: 300}}
      />
    </SafeAreaView>
  );
};

export default App;
