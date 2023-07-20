//
//  ContentView.swift
//  sample-app-ios
//
//  Created by More, Sameer on 7/17/23.
//

import SwiftUI
import SharedComposeUI

struct ContentView: View {
    var body: some View {
        VStack {
            SimpleScreen()
                .background(Color.red)
            VStack {
                Image(systemName: "globe")
                    .imageScale(.large)
                    .foregroundColor(.accentColor)
                ZStack {

                    SharedGreeting().background(Color.blue)
                }.background(Color.red)
            }
            .background(Color.purple)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

struct Magic_Previews: PreviewProvider {
    static var previews: some View {
        MagicLoadingIndicator()
    }
}
