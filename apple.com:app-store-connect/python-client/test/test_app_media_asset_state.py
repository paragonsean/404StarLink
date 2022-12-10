# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_media_asset_state import AppMediaAssetState

class TestAppMediaAssetState(unittest.TestCase):
    """AppMediaAssetState unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppMediaAssetState:
        """Test AppMediaAssetState
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppMediaAssetState`
        """
        model = AppMediaAssetState()
        if include_optional:
            return AppMediaAssetState(
                errors = [
                    openapi_client.models.app_media_state_error.AppMediaStateError(
                        code = '', 
                        description = '', )
                    ],
                state = 'AWAITING_UPLOAD',
                warnings = [
                    openapi_client.models.app_media_state_error.AppMediaStateError(
                        code = '', 
                        description = '', )
                    ]
            )
        else:
            return AppMediaAssetState(
        )
        """

    def testAppMediaAssetState(self):
        """Test AppMediaAssetState"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
