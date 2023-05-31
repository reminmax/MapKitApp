package com.reminmax.mapkitapp.di

import android.content.Context
import com.reminmax.mapkitapp.common.AndroidIResourceProvider
import com.reminmax.mapkitapp.domain.resource_provider.IResourceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ResourceProviderModule {

    @Provides
    @Singleton
    fun provideAndroidResourceProvider(@ApplicationContext context: Context): IResourceProvider {
        return AndroidIResourceProvider(context)
    }
}