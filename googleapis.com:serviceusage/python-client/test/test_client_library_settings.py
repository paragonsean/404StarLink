# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.client_library_settings import ClientLibrarySettings

class TestClientLibrarySettings(unittest.TestCase):
    """ClientLibrarySettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ClientLibrarySettings:
        """Test ClientLibrarySettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ClientLibrarySettings`
        """
        model = ClientLibrarySettings()
        if include_optional:
            return ClientLibrarySettings(
                cpp_settings = openapi_client.models.cpp_settings.CppSettings(
                    common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                        destinations = [
                            'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                            ], 
                        reference_docs_uri = '', ), ),
                dotnet_settings = openapi_client.models.dotnet_settings.DotnetSettings(
                    common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                        destinations = [
                            'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                            ], 
                        reference_docs_uri = '', ), 
                    forced_namespace_aliases = [
                        ''
                        ], 
                    handwritten_signatures = [
                        ''
                        ], 
                    ignored_resources = [
                        ''
                        ], 
                    renamed_resources = {
                        'key' : ''
                        }, 
                    renamed_services = {
                        'key' : ''
                        }, ),
                go_settings = openapi_client.models.go_settings.GoSettings(
                    common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                        destinations = [
                            'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                            ], 
                        reference_docs_uri = '', ), ),
                java_settings = openapi_client.models.java_settings.JavaSettings(
                    common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                        destinations = [
                            'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                            ], 
                        reference_docs_uri = '', ), 
                    library_package = '', 
                    service_class_names = {
                        'key' : ''
                        }, ),
                launch_stage = 'LAUNCH_STAGE_UNSPECIFIED',
                node_settings = openapi_client.models.node_settings.NodeSettings(
                    common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                        destinations = [
                            'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                            ], 
                        reference_docs_uri = '', ), ),
                php_settings = openapi_client.models.php_settings.PhpSettings(
                    common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                        destinations = [
                            'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                            ], 
                        reference_docs_uri = '', ), ),
                python_settings = openapi_client.models.python_settings.PythonSettings(
                    common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                        destinations = [
                            'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                            ], 
                        reference_docs_uri = '', ), ),
                rest_numeric_enums = True,
                ruby_settings = openapi_client.models.ruby_settings.RubySettings(
                    common = openapi_client.models.common_language_settings.CommonLanguageSettings(
                        destinations = [
                            'CLIENT_LIBRARY_DESTINATION_UNSPECIFIED'
                            ], 
                        reference_docs_uri = '', ), ),
                version = ''
            )
        else:
            return ClientLibrarySettings(
        )
        """

    def testClientLibrarySettings(self):
        """Test ClientLibrarySettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
