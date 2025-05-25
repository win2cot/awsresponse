# AWS各種APIのレスポンスを見てみよう

## ssm

### data

| path | type | value |
| --- | --- | --- |
| /test/prd/path01 | String | data01 |
| /test/prd/path02 | String | data02 |
| /test/prd/path03 | String | data03 |
| /test/prd/path04 | String | data04 |
| /test/prd/path05 | String | data05 |
| /test/prd/path06 | String | data06 |
| /test/prd/path07 | String | data07 |
| /test/prd/path08 | String | data08 |
| /test/prd/path09 | String | data09 |
| /test/prd/path10 | String | data10 |
| /test/prd/path11 | String | data11 |
| /test/prd/path12 | String | data12 |
| /test/prd/path13 | String | data13 |
| /test/prd/path14 | String | data14 |
| /test/prd/path15 | String | data15 |
| /test/dev/path01 | String | data01 |

### GetParametersByPath

```
HTTP/1.1 200 OK
Server: Server
Date: Sun, 25 May 2025 13:55:32 GMT
Content-Type: application/x-amz-json-1.1
Content-Length: 2721
Connection: keep-alive
x-amzn-RequestId: 85c491a5-481a-4c17-a2b0-a1c2387afd85

{
  "NextToken":"**********",
  "Parameters":[
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path02","DataType":"text","LastModifiedDate":1.748181331171E9,"Name":"/test/prd/path02","Type":"String","Value":"data02","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path03","DataType":"text","LastModifiedDate":1.748181331238E9,"Name":"/test/prd/path03","Type":"String","Value":"data03","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path04","DataType":"text","LastModifiedDate":1.748181331314E9,"Name":"/test/prd/path04","Type":"String","Value":"data04","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path05","DataType":"text","LastModifiedDate":1.748181331391E9,"Name":"/test/prd/path05","Type":"String","Value":"data05","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path06","DataType":"text","LastModifiedDate":1.748181331468E9,"Name":"/test/prd/path06","Type":"String","Value":"data06","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path08","DataType":"text","LastModifiedDate":1.748181331629E9,"Name":"/test/prd/path08","Type":"String","Value":"data08","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path10","DataType":"text","LastModifiedDate":1.748181331781E9,"Name":"/test/prd/path10","Type":"String","Value":"data10","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path11","DataType":"text","LastModifiedDate":1.748181331864E9,"Name":"/test/prd/path11","Type":"String","Value":"data11","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path14","DataType":"text","LastModifiedDate":1.748181332089E9,"Name":"/test/prd/path14","Type":"String","Value":"data14","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path15","DataType":"text","LastModifiedDate":1.748181332166E9,"Name":"/test/prd/path15","Type":"String","Value":"data15","Version":1}
  ]
}
```
```
HTTP/1.1 200 OK
Server: Server
Date: Sun, 25 May 2025 13:55:32 GMT
Content-Type: application/x-amz-json-1.1
Content-Length: 1021
Connection: keep-alive
x-amzn-RequestId: efc07d23-4a3d-4bbe-8463-3d5dda45a6cd

{
  "Parameters":[
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path01","DataType":"text","LastModifiedDate":1.748181331061E9,"Name":"/test/prd/path01","Type":"String","Value":"data01","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path07","DataType":"text","LastModifiedDate":1.748181331547E9,"Name":"/test/prd/path07","Type":"String","Value":"data07","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path09","DataType":"text","LastModifiedDate":1.748181331699E9,"Name":"/test/prd/path09","Type":"String","Value":"data09","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path12","DataType":"text","LastModifiedDate":1.748181331944E9,"Name":"/test/prd/path12","Type":"String","Value":"data12","Version":1},
    {"ARN":"arn:aws:ssm:ap-northeast-1:${AWS::AccountId}:parameter/test/prd/path13","DataType":"text","LastModifiedDate":1.748181332022E9,"Name":"/test/prd/path13","Type":"String","Value":"data13","Version":1}
  ]
}
```
