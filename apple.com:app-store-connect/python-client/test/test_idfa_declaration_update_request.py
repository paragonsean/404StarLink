# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.idfa_declaration_update_request import IdfaDeclarationUpdateRequest

class TestIdfaDeclarationUpdateRequest(unittest.TestCase):
    """IdfaDeclarationUpdateRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> IdfaDeclarationUpdateRequest:
        """Test IdfaDeclarationUpdateRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `IdfaDeclarationUpdateRequest`
        """
        model = IdfaDeclarationUpdateRequest()
        if include_optional:
            return IdfaDeclarationUpdateRequest(
                data = openapi_client.models.idfa_declaration_update_request_data.IdfaDeclarationUpdateRequest_data(
                    attributes = openapi_client.models.idfa_declaration_attributes.IdfaDeclaration_attributes(
                        attributes_action_with_previous_ad = True, 
                        attributes_app_installation_to_previous_ad = True, 
                        honors_limited_ad_tracking = True, 
                        serves_ads = True, ), 
                    id = '', 
                    type = 'idfaDeclarations', )
            )
        else:
            return IdfaDeclarationUpdateRequest(
                data = openapi_client.models.idfa_declaration_update_request_data.IdfaDeclarationUpdateRequest_data(
                    attributes = openapi_client.models.idfa_declaration_attributes.IdfaDeclaration_attributes(
                        attributes_action_with_previous_ad = True, 
                        attributes_app_installation_to_previous_ad = True, 
                        honors_limited_ad_tracking = True, 
                        serves_ads = True, ), 
                    id = '', 
                    type = 'idfaDeclarations', ),
        )
        """

    def testIdfaDeclarationUpdateRequest(self):
        """Test IdfaDeclarationUpdateRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
