# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.source_info import SourceInfo

class TestSourceInfo(unittest.TestCase):
    """SourceInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SourceInfo:
        """Test SourceInfo
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SourceInfo`
        """
        model = SourceInfo()
        if include_optional:
            return SourceInfo(
                source_files = [
                    {
                        'key' : null
                        }
                    ]
            )
        else:
            return SourceInfo(
        )
        """

    def testSourceInfo(self):
        """Test SourceInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
