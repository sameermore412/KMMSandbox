//
//  LoadingIndicators.swift
//  sample-app-ios
//
//  Created by More, Sameer on 7/18/23.
//

import Foundation
import SharedComposeUI
import SwiftUI

struct MagicLoadingIndicator: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        let controller = LoadingWidgetsKt.MagicLoadingIndicatorViewController(size: 75)
        return controller
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}
