# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.always_on_vpn_package import AlwaysOnVpnPackage

class TestAlwaysOnVpnPackage(unittest.TestCase):
    """AlwaysOnVpnPackage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AlwaysOnVpnPackage:
        """Test AlwaysOnVpnPackage
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AlwaysOnVpnPackage`
        """
        model = AlwaysOnVpnPackage()
        if include_optional:
            return AlwaysOnVpnPackage(
                lockdown_enabled = True,
                package_name = ''
            )
        else:
            return AlwaysOnVpnPackage(
        )
        """

    def testAlwaysOnVpnPackage(self):
        """Test AlwaysOnVpnPackage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
