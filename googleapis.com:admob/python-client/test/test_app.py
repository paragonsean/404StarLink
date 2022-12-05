# coding: utf-8

"""
    AdMob API

    The AdMob API allows publishers to programmatically get information about their AdMob account. 

    The version of the OpenAPI document: v1beta
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app import App

class TestApp(unittest.TestCase):
    """App unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> App:
        """Test App
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `App`
        """
        model = App()
        if include_optional:
            return App(
                app_approval_state = 'APP_APPROVAL_STATE_UNSPECIFIED',
                app_id = '',
                linked_app_info = openapi_client.models.app_linked_app_info.AppLinkedAppInfo(
                    app_store_id = '', 
                    display_name = '', ),
                manual_app_info = openapi_client.models.app_manual_app_info.AppManualAppInfo(
                    display_name = '', ),
                name = '',
                platform = ''
            )
        else:
            return App(
        )
        """

    def testApp(self):
        """Test App"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
