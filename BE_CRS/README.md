# Architecture diagram

![alt text](/images/Picture1.jpg)

Thành phần:

- API Gateway: là điểm truy cập duy nhất cho các ứng dụng bên ngoài. Nó chịu trách nhiệm định tuyến các yêu cầu đến các services thích hợp, xử lý xác thực và ủy quyền và quản lý lưu lượng truy cập.
- Config Server: là một kho lưu trữ tập trung cho các cấu hình ứng dụng. Điều này cho phép các services tải xuống cấu hình của chúng từ một vị trí duy nhất, giúp dễ dàng quản lý và triển khai các thay đổi cấu hình.
- Eureka: là một máy chủ khám phá dịch vụ cho phép các services đăng ký và tìm kiếm nhau. Điều này rất quan trọng để các services có thể giao tiếp với nhau một cách hiệu quả
- HTTP: Giao tiếp các dịch vụ.
- Zipkin: theo dõi phân tán, nâng cao khả năng quan sát ứng dụng và cho phép trực quan hóa cũng như khắc phục sự cố về độ trễ.
- Service đăng kí học phần:
- Service xem điểm:
- Service công nợ:
- Service tốt nghiệp:
