# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.vendor_tag import VendorTag

class TestVendorTag(unittest.TestCase):
    """VendorTag unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VendorTag:
        """Test VendorTag
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VendorTag`
        """
        model = VendorTag()
        if include_optional:
            return VendorTag(
                color = '',
                name = ''
            )
        else:
            return VendorTag(
        )
        """

    def testVendorTag(self):
        """Test VendorTag"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
