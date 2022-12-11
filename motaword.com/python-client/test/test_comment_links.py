# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.comment_links import CommentLinks

class TestCommentLinks(unittest.TestCase):
    """CommentLinks unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CommentLinks:
        """Test CommentLinks
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CommentLinks`
        """
        model = CommentLinks()
        if include_optional:
            return CommentLinks(
                var_self = openapi_client.models.href.Href(
                    href = '', ),
                activity = openapi_client.models.href.Href(
                    href = '', ),
                project = openapi_client.models.href.Href(
                    href = '', )
            )
        else:
            return CommentLinks(
        )
        """

    def testCommentLinks(self):
        """Test CommentLinks"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
