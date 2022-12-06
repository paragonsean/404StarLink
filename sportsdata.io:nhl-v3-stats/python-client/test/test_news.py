# coding: utf-8

"""
    NHL v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.news import News

class TestNews(unittest.TestCase):
    """News unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> News:
        """Test News
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `News`
        """
        model = News()
        if include_optional:
            return News(
                content = '',
                news_id = 56,
                player_id = 56,
                source = '',
                team = '',
                team_id = 56,
                terms_of_use = '',
                title = '',
                updated = '',
                url = ''
            )
        else:
            return News(
        )
        """

    def testNews(self):
        """Test News"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
