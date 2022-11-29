# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.guest_installed_application_list import GuestInstalledApplicationList

class TestGuestInstalledApplicationList(unittest.TestCase):
    """GuestInstalledApplicationList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GuestInstalledApplicationList:
        """Test GuestInstalledApplicationList
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GuestInstalledApplicationList`
        """
        model = GuestInstalledApplicationList()
        if include_optional:
            return GuestInstalledApplicationList(
                entries = [
                    openapi_client.models.guest_installed_application.GuestInstalledApplication(
                        name = '', 
                        path = '', 
                        time = '', 
                        vendor = '', 
                        version = '', )
                    ]
            )
        else:
            return GuestInstalledApplicationList(
        )
        """

    def testGuestInstalledApplicationList(self):
        """Test GuestInstalledApplicationList"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
