# coding: utf-8

"""
    AWSMarketplace Metering

    <fullname>AWS Marketplace Metering Service</fullname> <p>This reference provides descriptions of the low-level AWS Marketplace Metering Service API.</p> <p>AWS Marketplace sellers can use this API to submit usage data for custom usage dimensions.</p> <p>For information on the permissions you need to use this API, see <a href=\"https://docs.aws.amazon.com/marketplace/latest/userguide/iam-user-policy-for-aws-marketplace-actions.html\">AWS Marketplace metering and entitlement API permissions</a> in the <i>AWS Marketplace Seller Guide.</i> </p> <p> <b>Submitting Metering Records</b> </p> <ul> <li> <p> <i>MeterUsage</i> - Submits the metering record for an AWS Marketplace product. <code>MeterUsage</code> is called from an EC2 instance or a container running on EKS or ECS.</p> </li> <li> <p> <i>BatchMeterUsage</i> - Submits the metering record for a set of customers. <code>BatchMeterUsage</code> is called from a software-as-a-service (SaaS) application.</p> </li> </ul> <p> <b>Accepting New Customers</b> </p> <ul> <li> <p> <i>ResolveCustomer</i> - Called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a Registration Token through the browser. The Registration Token is resolved through this API to obtain a <code>CustomerIdentifier</code> along with the <code>CustomerAWSAccountId</code> and <code>ProductCode</code>.</p> </li> </ul> <p> <b>Entitlement and Metering for Paid Container Products</b> </p> <ul> <li> <p>Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the <code>RegisterUsage</code> operation for software entitlement and metering. Free and BYOL products for Amazon ECS or Amazon EKS aren't required to call <code>RegisterUsage</code>, but you can do so if you want to receive usage data in your seller reports. For more information on using the <code>RegisterUsage</code> operation, see <a href=\"https://docs.aws.amazon.com/marketplace/latest/userguide/container-based-products.html\">Container-Based Products</a>. </p> </li> </ul> <p> <code>BatchMeterUsage</code> API calls are captured by AWS CloudTrail. You can use Cloudtrail to verify that the SaaS metering records that you sent are accurate by searching for records with the <code>eventName</code> of <code>BatchMeterUsage</code>. You can also use CloudTrail to audit records over time. For more information, see the <i> <a href=\"http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html\">AWS CloudTrail User Guide</a>.</i> </p>

    The version of the OpenAPI document: 2016-01-14
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501

from typing import Any, Optional
from typing_extensions import Self

class OpenApiException(Exception):
    """The base exception class for all OpenAPIExceptions"""


class ApiTypeError(OpenApiException, TypeError):
    def __init__(self, msg, path_to_item=None, valid_classes=None,
                 key_type=None) -> None:
        """ Raises an exception for TypeErrors

        Args:
            msg (str): the exception message

        Keyword Args:
            path_to_item (list): a list of keys an indices to get to the
                                 current_item
                                 None if unset
            valid_classes (tuple): the primitive classes that current item
                                   should be an instance of
                                   None if unset
            key_type (bool): False if our value is a value in a dict
                             True if it is a key in a dict
                             False if our item is an item in a list
                             None if unset
        """
        self.path_to_item = path_to_item
        self.valid_classes = valid_classes
        self.key_type = key_type
        full_msg = msg
        if path_to_item:
            full_msg = "{0} at {1}".format(msg, render_path(path_to_item))
        super(ApiTypeError, self).__init__(full_msg)


class ApiValueError(OpenApiException, ValueError):
    def __init__(self, msg, path_to_item=None) -> None:
        """
        Args:
            msg (str): the exception message

        Keyword Args:
            path_to_item (list) the path to the exception in the
                received_data dict. None if unset
        """

        self.path_to_item = path_to_item
        full_msg = msg
        if path_to_item:
            full_msg = "{0} at {1}".format(msg, render_path(path_to_item))
        super(ApiValueError, self).__init__(full_msg)


class ApiAttributeError(OpenApiException, AttributeError):
    def __init__(self, msg, path_to_item=None) -> None:
        """
        Raised when an attribute reference or assignment fails.

        Args:
            msg (str): the exception message

        Keyword Args:
            path_to_item (None/list) the path to the exception in the
                received_data dict
        """
        self.path_to_item = path_to_item
        full_msg = msg
        if path_to_item:
            full_msg = "{0} at {1}".format(msg, render_path(path_to_item))
        super(ApiAttributeError, self).__init__(full_msg)


class ApiKeyError(OpenApiException, KeyError):
    def __init__(self, msg, path_to_item=None) -> None:
        """
        Args:
            msg (str): the exception message

        Keyword Args:
            path_to_item (None/list) the path to the exception in the
                received_data dict
        """
        self.path_to_item = path_to_item
        full_msg = msg
        if path_to_item:
            full_msg = "{0} at {1}".format(msg, render_path(path_to_item))
        super(ApiKeyError, self).__init__(full_msg)


class ApiException(OpenApiException):

    def __init__(
        self, 
        status=None, 
        reason=None, 
        http_resp=None,
        *,
        body: Optional[str] = None,
        data: Optional[Any] = None,
    ) -> None:
        self.status = status
        self.reason = reason
        self.body = body
        self.data = data
        self.headers = None

        if http_resp:
            if self.status is None:
                self.status = http_resp.status
            if self.reason is None:
                self.reason = http_resp.reason
            if self.body is None:
                try:
                    self.body = http_resp.data.decode('utf-8')
                except Exception:
                    pass
            self.headers = http_resp.getheaders()

    @classmethod
    def from_response(
        cls, 
        *, 
        http_resp, 
        body: Optional[str], 
        data: Optional[Any],
    ) -> Self:
        if http_resp.status == 400:
            raise BadRequestException(http_resp=http_resp, body=body, data=data)

        if http_resp.status == 401:
            raise UnauthorizedException(http_resp=http_resp, body=body, data=data)

        if http_resp.status == 403:
            raise ForbiddenException(http_resp=http_resp, body=body, data=data)

        if http_resp.status == 404:
            raise NotFoundException(http_resp=http_resp, body=body, data=data)

        if 500 <= http_resp.status <= 599:
            raise ServiceException(http_resp=http_resp, body=body, data=data)
        raise ApiException(http_resp=http_resp, body=body, data=data)

    def __str__(self):
        """Custom error messages for exception"""
        error_message = "({0})\n"\
                        "Reason: {1}\n".format(self.status, self.reason)
        if self.headers:
            error_message += "HTTP response headers: {0}\n".format(
                self.headers)

        if self.data or self.body:
            error_message += "HTTP response body: {0}\n".format(self.data or self.body)

        return error_message


class BadRequestException(ApiException):
    pass


class NotFoundException(ApiException):
    pass


class UnauthorizedException(ApiException):
    pass


class ForbiddenException(ApiException):
    pass


class ServiceException(ApiException):
    pass


def render_path(path_to_item):
    """Returns a string representation of a path"""
    result = ""
    for pth in path_to_item:
        if isinstance(pth, int):
            result += "[{0}]".format(pth)
        else:
            result += "['{0}']".format(pth)
    return result
