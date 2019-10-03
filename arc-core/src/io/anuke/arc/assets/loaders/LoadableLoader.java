package io.anuke.arc.assets.loaders;

import io.anuke.arc.assets.*;
import io.anuke.arc.assets.AssetManager.*;
import io.anuke.arc.assets.loaders.LoadableLoader.*;
import io.anuke.arc.collection.*;
import io.anuke.arc.files.*;

public class LoadableLoader extends AsynchronousAssetLoader<Loadable, LoadableParameter>{

    public LoadableLoader(FileHandleResolver resolver){
        super(resolver);
    }

    @Override
    public void loadAsync(AssetManager manager, String fileName, FileHandle file, LoadableParameter parameter){
        parameter.loadable.loadAsync();
    }

    @Override
    public Loadable loadSync(AssetManager manager, String fileName, FileHandle file, LoadableParameter parameter){
        parameter.loadable.loadSync();
        return parameter.loadable;
    }

    @Override
    public Array<AssetDescriptor> getDependencies(String fileName, FileHandle file, LoadableParameter parameter){
        return parameter.dependencies;
    }

    public static class LoadableParameter extends AssetLoaderParameters<Loadable>{
        public final Loadable loadable;
        public final Array<AssetDescriptor> dependencies;

        public LoadableParameter(Loadable loadable, Array<AssetDescriptor> dependencies){
            this.loadable = loadable;
            this.dependencies = dependencies;
        }

    }
}
