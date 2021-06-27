import * as React from 'react';
import {ImageStyle, requireNativeComponent} from 'react-native';

interface ComponentProps {
  src: string;
  style?: ImageStyle;
}

const ExampleImageView: React.FC<ComponentProps> = ({src, style}) => {
  return <NativeExampleImageView src={src} style={style} />;
};

const NativeExampleImageView = requireNativeComponent<{
  src: string;
  style?: ImageStyle;
}>('ExampleImageView');

export default ExampleImageView;
