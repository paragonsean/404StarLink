# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.app_store_version_phased_release_attributes import AppStoreVersionPhasedReleaseAttributes

class TestAppStoreVersionPhasedReleaseAttributes(unittest.TestCase):
    """AppStoreVersionPhasedReleaseAttributes unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AppStoreVersionPhasedReleaseAttributes:
        """Test AppStoreVersionPhasedReleaseAttributes
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AppStoreVersionPhasedReleaseAttributes`
        """
        model = AppStoreVersionPhasedReleaseAttributes()
        if include_optional:
            return AppStoreVersionPhasedReleaseAttributes(
                current_day_number = 56,
                phased_release_state = 'INACTIVE',
                start_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                total_pause_duration = 56
            )
        else:
            return AppStoreVersionPhasedReleaseAttributes(
        )
        """

    def testAppStoreVersionPhasedReleaseAttributes(self):
        """Test AppStoreVersionPhasedReleaseAttributes"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
