# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.gists_create_request_files_value import GistsCreateRequestFilesValue

class TestGistsCreateRequestFilesValue(unittest.TestCase):
    """GistsCreateRequestFilesValue unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GistsCreateRequestFilesValue:
        """Test GistsCreateRequestFilesValue
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GistsCreateRequestFilesValue`
        """
        model = GistsCreateRequestFilesValue()
        if include_optional:
            return GistsCreateRequestFilesValue(
                content = ''
            )
        else:
            return GistsCreateRequestFilesValue(
                content = '',
        )
        """

    def testGistsCreateRequestFilesValue(self):
        """Test GistsCreateRequestFilesValue"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
