//
//  SimpleScreenWrapper.swift
//  sample-app-ios
//
//  Created by More, Sameer on 7/20/23.
//

import Foundation
import SharedComposeUI
import SwiftUI

struct SimpleScreen: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        let controller = HomeScreenKt.HomeScreenViewController()
        return controller
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}
