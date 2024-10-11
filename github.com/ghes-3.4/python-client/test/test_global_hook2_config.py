# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.global_hook2_config import GlobalHook2Config

class TestGlobalHook2Config(unittest.TestCase):
    """GlobalHook2Config unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GlobalHook2Config:
        """Test GlobalHook2Config
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GlobalHook2Config`
        """
        model = GlobalHook2Config()
        if include_optional:
            return GlobalHook2Config(
                content_type = '',
                insecure_ssl = '',
                url = ''
            )
        else:
            return GlobalHook2Config(
        )
        """

    def testGlobalHook2Config(self):
        """Test GlobalHook2Config"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
