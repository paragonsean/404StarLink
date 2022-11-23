# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.content_attributes import ContentAttributes

class TestContentAttributes(unittest.TestCase):
    """ContentAttributes unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ContentAttributes:
        """Test ContentAttributes
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ContentAttributes`
        """
        model = ContentAttributes()
        if include_optional:
            return ContentAttributes(
                album_name = 'Blood On the Tracks',
                artist_name = 'Bob Dylan',
                artwork = openapi_client.models.content_attributes_artwork.ContentAttributes_artwork(
                    url = '', ),
                composer_name = 'B. Dylan',
                duration_in_millis = 56,
                genre_names = [
                    ''
                    ],
                name = 'Tangled Up In Blue',
                track_number = 1
            )
        else:
            return ContentAttributes(
        )
        """

    def testContentAttributes(self):
        """Test ContentAttributes"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
