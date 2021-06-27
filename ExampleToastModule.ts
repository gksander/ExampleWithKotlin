import {NativeModules} from 'react-native';

const {ExampleToastModule} = NativeModules;

interface ExampleToastModuleInterface {
  showToast(message: string): void;
}

export default ExampleToastModule as ExampleToastModuleInterface;
