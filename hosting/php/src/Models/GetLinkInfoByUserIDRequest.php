<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Aliyun\Hosting\SDK\Models;

use AlibabaCloud\Tea\Model;

/**
 * *
 */
class GetLinkInfoByUserIDRequest extends Model {
    protected $_name = [
        'userId' => 'user_id',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->headers) {
            $res['headers'] = $this->headers;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetLinkInfoByUserIDRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['headers'])){
            $model->headers = $map['headers'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        return $model;
    }
    public $headers;

    /**
     * @description user ID
     * @example 123987123617823
     * @var string
     */
    public $userId;

}
