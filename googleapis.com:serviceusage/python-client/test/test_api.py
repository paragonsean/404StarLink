# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.api import Api

class TestApi(unittest.TestCase):
    """Api unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Api:
        """Test Api
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Api`
        """
        model = Api()
        if include_optional:
            return Api(
                methods = [
                    openapi_client.models.method.Method(
                        name = '', 
                        options = [
                            openapi_client.models.option.Option(
                                name = '', 
                                value = {
                                    'key' : null
                                    }, )
                            ], 
                        request_streaming = True, 
                        request_type_url = '', 
                        response_streaming = True, 
                        response_type_url = '', 
                        syntax = 'SYNTAX_PROTO2', )
                    ],
                mixins = [
                    openapi_client.models.mixin.Mixin(
                        name = '', 
                        root = '', )
                    ],
                name = '',
                options = [
                    openapi_client.models.option.Option(
                        name = '', 
                        value = {
                            'key' : null
                            }, )
                    ],
                source_context = openapi_client.models.source_context.SourceContext(
                    file_name = '', ),
                syntax = 'SYNTAX_PROTO2',
                version = ''
            )
        else:
            return Api(
        )
        """

    def testApi(self):
        """Test Api"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
