# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.application import Application

class TestApplication(unittest.TestCase):
    """Application unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Application:
        """Test Application
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Application`
        """
        model = Application()
        if include_optional:
            return Application(
                app_pricing = 'APP_PRICING_UNSPECIFIED',
                app_tracks = [
                    openapi_client.models.app_track_info.AppTrackInfo(
                        track_alias = '', 
                        track_id = '', )
                    ],
                app_versions = [
                    openapi_client.models.app_version.AppVersion(
                        production = True, 
                        track_ids = [
                            ''
                            ], 
                        version_code = 56, 
                        version_string = '', )
                    ],
                author = '',
                available_countries = [
                    ''
                    ],
                category = '',
                content_rating = 'CONTENT_RATING_UNSPECIFIED',
                description = '',
                distribution_channel = 'DISTRIBUTION_CHANNEL_UNSPECIFIED',
                features = [
                    'APP_FEATURE_UNSPECIFIED'
                    ],
                full_description = '',
                icon_url = '',
                managed_properties = [
                    openapi_client.models.managed_property.ManagedProperty(
                        default_value = null, 
                        description = '', 
                        entries = [
                            openapi_client.models.managed_property_entry.ManagedPropertyEntry(
                                name = '', 
                                value = '', )
                            ], 
                        key = '', 
                        nested_properties = [
                            openapi_client.models.managed_property.ManagedProperty(
                                default_value = null, 
                                description = '', 
                                key = '', 
                                title = '', 
                                type = 'MANAGED_PROPERTY_TYPE_UNSPECIFIED', )
                            ], 
                        title = '', 
                        type = 'MANAGED_PROPERTY_TYPE_UNSPECIFIED', )
                    ],
                min_android_sdk_version = 56,
                name = '',
                permissions = [
                    openapi_client.models.application_permission.ApplicationPermission(
                        description = '', 
                        name = '', 
                        permission_id = '', )
                    ],
                play_store_url = '',
                recent_changes = '',
                screenshot_urls = [
                    ''
                    ],
                small_icon_url = '',
                title = '',
                update_time = ''
            )
        else:
            return Application(
        )
        """

    def testApplication(self):
        """Test Application"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
