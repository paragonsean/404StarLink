# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.advanced_security_overrides import AdvancedSecurityOverrides

class TestAdvancedSecurityOverrides(unittest.TestCase):
    """AdvancedSecurityOverrides unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AdvancedSecurityOverrides:
        """Test AdvancedSecurityOverrides
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AdvancedSecurityOverrides`
        """
        model = AdvancedSecurityOverrides()
        if include_optional:
            return AdvancedSecurityOverrides(
                common_criteria_mode = 'COMMON_CRITERIA_MODE_UNSPECIFIED',
                developer_settings = 'DEVELOPER_SETTINGS_UNSPECIFIED',
                google_play_protect_verify_apps = 'GOOGLE_PLAY_PROTECT_VERIFY_APPS_UNSPECIFIED',
                personal_apps_that_can_read_work_notifications = [
                    ''
                    ],
                untrusted_apps_policy = 'UNTRUSTED_APPS_POLICY_UNSPECIFIED'
            )
        else:
            return AdvancedSecurityOverrides(
        )
        """

    def testAdvancedSecurityOverrides(self):
        """Test AdvancedSecurityOverrides"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
