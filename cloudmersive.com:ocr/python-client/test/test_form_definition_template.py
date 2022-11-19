# coding: utf-8

"""
    ocrapi

    The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.form_definition_template import FormDefinitionTemplate

class TestFormDefinitionTemplate(unittest.TestCase):
    """FormDefinitionTemplate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FormDefinitionTemplate:
        """Test FormDefinitionTemplate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FormDefinitionTemplate`
        """
        model = FormDefinitionTemplate()
        if include_optional:
            return FormDefinitionTemplate(
                field_definitions = [
                    openapi_client.models.form_field_definition.FormFieldDefinition(
                        allow_numeric_digits = True, 
                        alternate_anchor = '', 
                        anchor_mode = '', 
                        bottom_anchor = '', 
                        data_type = '', 
                        field_id = '', 
                        horizontal_alignment_type = '', 
                        ignore = [
                            ''
                            ], 
                        left_anchor = '', 
                        minimum_character_count = 56, 
                        options = '', 
                        target_digit_count = 56, 
                        target_field_height_relative = 1.337, 
                        target_field_horizontal_adjustment = 1.337, 
                        target_field_vertical_adjustment = 1.337, 
                        target_field_width_relative = 1.337, 
                        top_anchor = '', 
                        vertical_alignment_type = '', )
                    ],
                table_definitions = [
                    openapi_client.models.form_table_definition.FormTableDefinition(
                        column_definitions = [
                            openapi_client.models.form_table_column_definition.FormTableColumnDefinition(
                                allow_numeric_digits = True, 
                                anchor_mode = '', 
                                column_id = '', 
                                data_type = '', 
                                minimum_character_count = 56, 
                                top_anchor = '', )
                            ], 
                        table_id = '', 
                        target_row_height_relative = 1.337, 
                        target_table_height_relative = 1.337, )
                    ]
            )
        else:
            return FormDefinitionTemplate(
        )
        """

    def testFormDefinitionTemplate(self):
        """Test FormDefinitionTemplate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
