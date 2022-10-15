# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.http_rule import HttpRule

class TestHttpRule(unittest.TestCase):
    """HttpRule unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> HttpRule:
        """Test HttpRule
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `HttpRule`
        """
        model = HttpRule()
        if include_optional:
            return HttpRule(
                additional_bindings = [
                    openapi_client.models.http_rule.HttpRule(
                        body = '', 
                        custom = openapi_client.models.custom_http_pattern.CustomHttpPattern(
                            kind = '', 
                            path = '', ), 
                        delete = '', 
                        get = '', 
                        patch = '', 
                        post = '', 
                        put = '', 
                        response_body = '', 
                        selector = '', )
                    ],
                body = '',
                custom = openapi_client.models.custom_http_pattern.CustomHttpPattern(
                    kind = '', 
                    path = '', ),
                delete = '',
                get = '',
                patch = '',
                post = '',
                put = '',
                response_body = '',
                selector = ''
            )
        else:
            return HttpRule(
        )
        """

    def testHttpRule(self):
        """Test HttpRule"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
