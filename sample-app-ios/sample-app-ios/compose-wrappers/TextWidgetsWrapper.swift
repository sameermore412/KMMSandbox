//
//  TextWidgetsWrapper.swift
//  sample-app-ios
//
//  Created by More, Sameer on 7/18/23.
//

import Foundation
import SharedComposeUI
import SwiftUI

struct SharedGreeting: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        let controller = TextWidgetsKt.SharedGreetingComposeUIViewController()
        return controller
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}
