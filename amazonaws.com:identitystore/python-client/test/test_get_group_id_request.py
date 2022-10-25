# coding: utf-8

"""
    AWS SSO Identity Store

    <p>The Identity Store service used by AWS IAM Identity Center (successor to AWS Single Sign-On) provides a single place to retrieve all of your identities (users and groups). For more information, see the <a href=\"https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html\">IAM Identity Center User Guide</a>.</p> <pre><code> &lt;note&gt; &lt;p&gt;Although AWS Single Sign-On was renamed, the &lt;code&gt;sso&lt;/code&gt; and &lt;code&gt;identitystore&lt;/code&gt; API namespaces will continue to retain their original name for backward compatibility purposes. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html#renamed&quot;&gt;IAM Identity Center rename&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;This reference guide describes the identity store operations that you can call programatically and includes detailed information about data types and errors.&lt;/p&gt; </code></pre>

    The version of the OpenAPI document: 2020-06-15
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.get_group_id_request import GetGroupIdRequest

class TestGetGroupIdRequest(unittest.TestCase):
    """GetGroupIdRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetGroupIdRequest:
        """Test GetGroupIdRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetGroupIdRequest`
        """
        model = GetGroupIdRequest()
        if include_optional:
            return GetGroupIdRequest(
                identity_store_id = None,
                alternate_identifier = None
            )
        else:
            return GetGroupIdRequest(
                identity_store_id = None,
                alternate_identifier = None,
        )
        """

    def testGetGroupIdRequest(self):
        """Test GetGroupIdRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
