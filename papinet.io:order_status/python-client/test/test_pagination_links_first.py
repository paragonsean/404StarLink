# coding: utf-8

"""
    papiNet API

    papinet API is a global initiative for the Forst and Paper supply chain.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.pagination_links_first import PaginationLinksFirst

class TestPaginationLinksFirst(unittest.TestCase):
    """PaginationLinksFirst unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PaginationLinksFirst:
        """Test PaginationLinksFirst
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PaginationLinksFirst`
        """
        model = PaginationLinksFirst()
        if include_optional:
            return PaginationLinksFirst(
                href = ''
            )
        else:
            return PaginationLinksFirst(
        )
        """

    def testPaginationLinksFirst(self):
        """Test PaginationLinksFirst"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
