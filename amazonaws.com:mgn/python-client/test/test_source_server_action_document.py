# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.source_server_action_document import SourceServerActionDocument

class TestSourceServerActionDocument(unittest.TestCase):
    """SourceServerActionDocument unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SourceServerActionDocument:
        """Test SourceServerActionDocument
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SourceServerActionDocument`
        """
        model = SourceServerActionDocument()
        if include_optional:
            return SourceServerActionDocument(
                action_id = None,
                action_name = None,
                active = None,
                category = None,
                description = None,
                document_identifier = None,
                document_version = None,
                external_parameters = None,
                must_succeed_for_cutover = None,
                order = None,
                parameters = None,
                timeout_seconds = None
            )
        else:
            return SourceServerActionDocument(
        )
        """

    def testSourceServerActionDocument(self):
        """Test SourceServerActionDocument"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
