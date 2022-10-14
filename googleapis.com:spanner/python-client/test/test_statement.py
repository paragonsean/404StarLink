# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.statement import Statement

class TestStatement(unittest.TestCase):
    """Statement unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Statement:
        """Test Statement
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Statement`
        """
        model = Statement()
        if include_optional:
            return Statement(
                param_types = {
                    'key' : openapi_client.models.type.Type(
                        array_element_type = openapi_client.models.type.Type(
                            code = 'TYPE_CODE_UNSPECIFIED', 
                            proto_type_fqn = '', 
                            struct_type = openapi_client.models.struct_type.StructType(
                                fields = [
                                    openapi_client.models.field.Field(
                                        name = '', 
                                        type = , )
                                    ], ), 
                            type_annotation = 'TYPE_ANNOTATION_CODE_UNSPECIFIED', ), 
                        code = 'TYPE_CODE_UNSPECIFIED', 
                        proto_type_fqn = '', 
                        struct_type = openapi_client.models.struct_type.StructType(), 
                        type_annotation = 'TYPE_ANNOTATION_CODE_UNSPECIFIED', )
                    },
                params = {
                    'key' : null
                    },
                sql = ''
            )
        else:
            return Statement(
        )
        """

    def testStatement(self):
        """Test Statement"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
