# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_web_apps_response import ListWebAppsResponse

class TestListWebAppsResponse(unittest.TestCase):
    """ListWebAppsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListWebAppsResponse:
        """Test ListWebAppsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListWebAppsResponse`
        """
        model = ListWebAppsResponse()
        if include_optional:
            return ListWebAppsResponse(
                next_page_token = '',
                web_apps = [
                    openapi_client.models.web_app.WebApp(
                        display_mode = 'DISPLAY_MODE_UNSPECIFIED', 
                        icons = [
                            openapi_client.models.web_app_icon.WebAppIcon(
                                image_data = '', )
                            ], 
                        name = '', 
                        start_url = '', 
                        title = '', 
                        version_code = '', )
                    ]
            )
        else:
            return ListWebAppsResponse(
        )
        """

    def testListWebAppsResponse(self):
        """Test ListWebAppsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
