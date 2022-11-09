# coding: utf-8

"""
    Contact Center AI Platform API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.list_locations_response import ListLocationsResponse

class TestListLocationsResponse(unittest.TestCase):
    """ListLocationsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListLocationsResponse:
        """Test ListLocationsResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListLocationsResponse`
        """
        model = ListLocationsResponse()
        if include_optional:
            return ListLocationsResponse(
                locations = [
                    openapi_client.models.location.Location(
                        display_name = '', 
                        labels = {
                            'key' : ''
                            }, 
                        location_id = '', 
                        metadata = {
                            'key' : null
                            }, 
                        name = '', )
                    ],
                next_page_token = ''
            )
        else:
            return ListLocationsResponse(
        )
        """

    def testListLocationsResponse(self):
        """Test ListLocationsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
