package com.flipbay.hiltscopes.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.android.scopes.ViewScoped

@Module
@InstallIn(ViewComponent::class)
object ViewModule {

    @Provides
    @ViewScoped
    fun provideDemo() = Demo()
}