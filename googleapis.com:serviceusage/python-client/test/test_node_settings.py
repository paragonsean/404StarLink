# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.node_settings import NodeSettings

class TestNodeSettings(unittest.TestCase):
    """NodeSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> NodeSettings:
        """Test NodeSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `NodeSettings`
        """
        model = NodeSettings()
        if include_optional:
            return NodeSettings(
                common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                    destinations = [
                        'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                        ], 
                    reference_docs_uri = '', )
            )
        else:
            return NodeSettings(
        )
        """

    def testNodeSettings(self):
        """Test NodeSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
