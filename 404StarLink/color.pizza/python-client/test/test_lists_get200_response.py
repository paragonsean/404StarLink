# coding: utf-8

"""
    Color Name API

    An API that provides names for colors based on their hex value

    The version of the OpenAPI document: 1.0.0
    Contact: color-name-api@elastiq.click
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.lists_get200_response import ListsGet200Response

class TestListsGet200Response(unittest.TestCase):
    """ListsGet200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListsGet200Response:
        """Test ListsGet200Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListsGet200Response`
        """
        model = ListsGet200Response()
        if include_optional:
            return ListsGet200Response(
                list_descriptions = openapi_client.models._lists__get_200_response_list_descriptions._lists__get_200_response_listDescriptions(
                    basic = openapi_client.models.list_description.listDescription(
                        color_count = 56, 
                        description = '', 
                        key = '', 
                        license = '', 
                        source = '', 
                        title = '', 
                        url = '', ), 
                    best_of = openapi_client.models.list_description.listDescription(
                        color_count = 56, 
                        description = '', 
                        key = '', 
                        license = '', 
                        source = '', 
                        title = '', 
                        url = '', ), 
                    chinese_traditional = , 
                    default = , 
                    french = , 
                    html = , 
                    japanese_traditional = , 
                    le_corbusier = , 
                    nbs_iscc = , 
                    ntc = , 
                    osxcrayons = , 
                    ral = , 
                    ridgway = , 
                    risograph = , 
                    sanzo_wada_i = , 
                    thesaurus = , 
                    werner = , 
                    wikipedia = , 
                    windows = , 
                    x11 = , 
                    xkcd = , ),
                local_available_color_name_lists = [
                    ''
                    ]
            )
        else:
            return ListsGet200Response(
        )
        """

    def testListsGet200Response(self):
        """Test ListsGet200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
