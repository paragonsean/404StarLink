# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.global_hook2 import GlobalHook2

class TestGlobalHook2(unittest.TestCase):
    """GlobalHook2 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GlobalHook2:
        """Test GlobalHook2
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GlobalHook2`
        """
        model = GlobalHook2()
        if include_optional:
            return GlobalHook2(
                active = True,
                config = openapi_client.models.global_hook_2_config.global_hook_2_config(
                    content_type = '', 
                    insecure_ssl = '', 
                    url = '', ),
                created_at = '',
                events = [
                    ''
                    ],
                id = 56,
                name = '',
                ping_url = '',
                type = '',
                updated_at = '',
                url = ''
            )
        else:
            return GlobalHook2(
        )
        """

    def testGlobalHook2(self):
        """Test GlobalHook2"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
